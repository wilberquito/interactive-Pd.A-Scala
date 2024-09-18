FROM almondsh/almond:latest

USER root

WORKDIR /home/wilberquito

RUN chown jovyan:users /home/wilberquito

COPY --chown=jovyan:users . .
