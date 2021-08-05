#!/usr/local/bin/bash

display_usage() {
  echo "This script must be run with at least 2 arguments if task is run_tests"
 	echo -e "Usage:" $0 "run_tests"
	}

if [  $# -lt 1 ]
then
		display_usage
		exit 1
fi

TASK=$1

case $TASK in
    run_tests)
        mvn -U -DskipTests=true clean install
        mvn clean verify -Dheadless.mode=false -Dwebdriver.driver=chrome -Dcucumber.filter.tags="@test" 
        ;;
    *)
      display_usage
      exit 1
      ;;
esac




