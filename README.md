# Scala tour

For teaching purposes, we will use `Jupyter Notebooks` that run `Scala` code. 

You might be interested in the details of how Jupyter Noteboks and Scala interact. If
that’s the case, refer to [this post](https://blog.brunk.io/posts/interactive-computing-with-jupyter-and-almond/)
which explains [almond](https://github.com/almond-sh/almond), the technology that makes this interactivity possible.

I provide a simple `Docker` image in order that provides Scala kernels for Jupyter environments.

In the parent directory `./` run the commands:

### Build

```sh
docker build --tag wilberquito/almondsh . --no-cache
```

### Run container with volume

```sh
docker run -it --rm -p 8888:8888 --volume ./notebooks:/home/wilberquito/notebooks wilberquito/almondsh:latest
```
