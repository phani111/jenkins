def call(fileName) {
    def props = readProperties file: fileName
    for (prop in props) {
        env[prop.key] = prop.value
    }
}
