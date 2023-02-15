FROM azul/zulu-openjdk-alpine:17-latest AS builder

COPY . /tmp
WORKDIR /tmp

RUN ./gradlew build

FROM azul/zulu-openjdk-alpine:17-latest
COPY --from=builder /tmp/build/libs/*.jar ./

CMD java -jar demo-*SNAPSHOT.jar