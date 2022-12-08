// proxy config to resolve CORS issue in dev mode

const PROXY_CONFIG = [
    {
        context: ['/api'],
        target: 'http://localhost:8080',
        secure: false,
        logLevel: 'debug'
    }
];

module.exports = PROXY_CONFIG;
