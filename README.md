# Build
mvn clean package && docker build -t nl.jerdalm/beepboop .

# RUN

docker rm -f beepboop || true && docker run -d -p 8080:8080 -p 4848:4848 --name beepboop nl.jerdalm/beepboop 