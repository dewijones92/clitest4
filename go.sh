set -x
set -e
export PATH=$(pwd):$PATH; ./gradlew clean && ./gradlew :examples:scraping:test --debug && ./gradlew build run |& ub tee log
