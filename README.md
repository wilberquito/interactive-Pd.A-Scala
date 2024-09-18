# Scala tour

For teaching purposes, we will use Jupyter notebooks that run Scala code. As a
student, you are likely here to learn how Scala works, and you may not be
interested in the details of how it interacts with Jupyter technology. If
that’s the case, you can refer to the materials in the `./notebooks/`
directory. However, if you are curious about how this setup is built, you might
want to read [this
post](https://blog.brunk.io/posts/interactive-computing-with-jupyter-and-almond/)
which explains `almond`, the technology that makes this interactivity possible.
If you'd like to use `almond`, you can find the project’s GitHub repository
[here](git@github.com:almond-sh/almond.git).

Bellow you'll find the the instructions to make run the
Scala kernel for Jupyter using docker.

## Build

```sh
docker build --tag wilberquito/almondsh .
```

## Run container with volume

```sh
docker run -it --rm -p 8888:8888 --volume ./notebooks:/home/wilberquito/notebooks wilberquito/almondsh:latest
```
