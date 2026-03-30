def call(String imageName) {
    sh "docker stop mybot || true"
    sh "docker rm mybot || true"
    sh "docker run -d --name mybot -p 5000:5000 ${imageName}"
}
