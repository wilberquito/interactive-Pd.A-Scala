# [Functional and OOP with SCALA](notebooks/_index.ipynb)

The SCALA content will be available through Jupyter Notebooks and some GitHub templates.

If you find any mistakes, please feel free to open an issue on the [**original repository**](https://github.com/wilberquito/interactive-Pd.A-SCALA/issues).

## Templates for working with SCALA

- **Exercisis template**
	
	> You can find the template [here](https://github.com/wilberquito/sbt-template)
	
	We provide a simple project template to help you avoid issues when creating a SCALA project.
	
	The template uses [**simple build tool (sbt)**](https://www.scala-sbt.org) as the package manager. We will use it also for building and compiling engine tool for SCALA.
	  
	We **recommend** using the [**sbt-template**](https://github.com/wilberquito/sbt-template) because it is configured with the version of SCALA that we will use: `SCALA 3.6`.

- **Actor's template**

	> You can find the template [here](https://github.com/wilberquito/typed-actors-nightmare)
	
	This template is a fork of the “Exercises template.” It is also configured with `SCALA 3.6` and includes the `AKKA actors` package.

## What do you need to follow along?

In our setup, you will need the following tools:

- [**IntelliJ IDEA**](https://www.jetbrains.com/idea/download) (Community Edition is sufficient)
    - Java Development Kit version 23 (JDK 23)
    - SCALA plugin
 
The `JDK 23` and the `SCALA plugin` are installed through `IntelliJ IDEA`.

<span style="color: green">Make sure everything is running smoothly for practice purposes.</span>

## Interactive Jupyter Notebooks and SCALA

You might be interested in the details of how Jupyter Noteboks and SCALA interact. If
that’s the case, refer to [this post](https://blog.brunk.io/posts/interactive-computing-with-jupyter-and-almond/)
which explains [almond](https://github.com/almond-sh/almond), the technology that makes this interactivity possible.

I provide a simple `Docker` image in order that provides SCALA kernels for Jupyter environments.

In the parent directory `./` run the commands:

### Build

```sh
docker build --tag wilberquito/almondsh . --no-cache
```

### Run container with volume

```sh
docker run -it --rm -p 8888:8888 \
	--volume ./notebooks:/home/wilberquito/notebooks \
	--volume ./interactive-Pd.A-Scala-solutions:/home/wilberquito/solutions \ 
	--volume ./images:/home/wilberquito/images  wilberquito/almondsh:latest 
```
