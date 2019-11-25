#!/usr/bin/env groovy

node {
        stage 'Checkout'
            checkout scm

        stage 'Build'
            sh 'mvn -DskipTests clean install'


     }
