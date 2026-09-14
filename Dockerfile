FROM almondsh/almond:0.14.1-scala-3.6.3

USER root

WORKDIR /home/jovyan

COPY --chown=jovyan:users . /home/jovyan/

USER jovyan

WORKDIR /home/jovyan
