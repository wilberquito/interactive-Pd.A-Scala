# [Functional and Object-oriented Programming (OOP) with Scala](notebooks/_index.ipynb)

A list of Jupyter Notebooks for the Pd.A subject.

If you find any mistake please feel free to add an issue on the [**original repository**](https://github.com/wilberquito/interactive-Pd.A-Scala/issues).

## Template for working with Scala

For teaching purposes, we will use `Jupyter Notebooks` that run `Scala` code. 

We provide a simple project template to avoid you to running into problems at the creation of a Scala project.

- This template in the original repository in branch [**sbt-template**](https://github.com/wilberquito/interactive-Pd.A-Scala/tree/sbt-template).
  
- The template uses [**simple build tool (sbt)**](https://www.scala-sbt.org) as the package manager. We will use it also for building and compiling engine tool for Scala.
  
- We recommend you to use the [**sbt-template**](https://github.com/wilberquito/interactive-Pd.A-Scala/tree/sbt-template) because it is configure with the version of Scala that we will use `Scala 3.6`.

## What do you need to follow up?

In our system we will need the following tools:

- [**IntelliJ IDEA**](https://www.jetbrains.com/idea/download) (community edition is enough)
    - Java Development Kit version 23 (JDK23)
    - Scala plugin
 
The `JDK23` and the `Scala plugin` is installed through `IntelliJ IDEA`.

<span style="color: green">You need everything running smoothly for practice purposes.</span>

## Interactive Jupyter Notebooks and Scala

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
