import { Container, Grid, Grow } from "@material-ui/core";
import React, { useEffect, useState } from 'react';
import { useDispatch } from 'react-redux';
import { useHistory, useLocation } from 'react-router-dom/cjs/react-router-dom.min.js';
import { getPosts } from '../../actions/posts.js';
import useStyles from "../../styles.js";
import Form from '../Form/Form.js';
import Posts from '../Posts/Posts.js';
// import ChipInput from "@material-ui-chip-input"

function useQuery () {
   return new URLSearchParams(useLocation().search)
  }

function Home() {
    const [currentID, setCurrentID] = useState(null);
  const classes = useStyles();
  const dispatch = useDispatch();
  const query = useQuery();
  const history = useHistory();
  const page = query.get('page') || 1;
  const searchQuery = query.get('searchQuery')
   
  useEffect(() => {
    dispatch(getPosts());
  }, [currentID, dispatch]);
  return (
    <Grow in>
        <Container maxWidth="xl">
          <Grid
            container
            justify-content="space-between"
            alignItems="stretch"
            spacing={3}
            classes={classes.gridContainer}
          >
            <Grid className={classes.mainContainer} item  xs={12} sm={6} md={9}>
              <Posts setCurrentID={setCurrentID} />
            </Grid>
            <Grid item xs={12} sm={6} md={3}>
              <Form currentID={currentID} setCurrentID={setCurrentID} />
            </Grid>
            {/* <Paper className={classes.pagination} elevation={6}>
              <Paginate/>
            </Paper> */}
          </Grid>
        </Container>
      </Grow>
  )
}

export default Home
