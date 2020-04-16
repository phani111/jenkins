def call(fileName) {
    print "Hello World"
    print fileName
    def props = readProperties file: fileName
    for (prop in props) {
        env[prop.key] = prop.value
    }
}
