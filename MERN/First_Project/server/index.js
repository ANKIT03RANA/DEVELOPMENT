import bodyParser from "body-parser";
import cors from "cors";
import dotenv from "dotenv";
import express from "express";
import mongoose from "mongoose";
import path from 'path';
import postRoutes from "./routes/posts.js";
import userRoutes from "./routes/users.js";

// mongoose.set('strictQuery', false)
const app = express();
dotenv.config();

app.use(bodyParser.json({ limit: "30mb", extended: true }));
app.use(bodyParser.urlencoded({ limit: "30mb", extended: true }));
app.use(cors());

app.use('/posts',postRoutes);
app.use('/user',userRoutes);

const __dirname = path.resolve();
if (process.env.NODE_ENV === 'production') {
  // app.use('/uploads', express.static('/var/data/uploads'));
  app.use(express.static(path.join(__dirname, '/ui/build')));

  app.get('*', (req, res) =>
    res.sendFile(path.resolve(__dirname, 'ui', 'build', 'index.html'))
  );
} else {
  // const __dirname = path.resolve();
  // app.use('/uploads', express.static(path.join(__dirname, '/uploads')));
  app.get('/', (req, res) => {
    res.send('API is running....');
  });
}

const PORT = process.env.PORT || 5000;

mongoose.connect(process.env.CONN_STR, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  })
  .then(() =>
    app.listen(PORT, () => console.log(`Server is running on port: http://localhost:${PORT}`))
  )
  .catch((err) => console.log(err));
