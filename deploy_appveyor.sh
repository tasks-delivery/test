#!/usr/bin/env bash

curl -H "Authorization: Bearer $APPVEYOR_TOKEN" -H "Content-Type: application/json" https://ci.appveyor.com/api/roles

#endpoint=https://api.travis-ci.com


#function travis-api {
 # curl -s $endpoint$1 \
  #     -H "Authorization: Bearer $APPVEYOR_TOKEN" \
   #    -H 'Content-Type: application/json' \
    #   "${@:2}"
#}