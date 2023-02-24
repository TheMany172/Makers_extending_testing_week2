// Originally taken from https://expressjs.com/en/starter/hello-world.html

// May need to do `npm install express` first,
// before running by using `node app.js`

const express = require('express')
const app = express()
const port = 3000

// second, more generic, solution is this one:
app.disable('x-powered-by')

app.use(function (req, res, next) {
    res.setHeader('Content-Security-Policy', "default-src 'none'; script-src 'self'; connect-src 'self'; img-src 'self'; style-src 'self'; frame-ancestors 'self'; form-action 'self';");
    next();
});

app.get('/', (req, res) => {
    // first solution is this one:
    // res.removeHeader('X-Powered-By')
    // app.setHeader('Does this work?')
    res.send('Hello World!')
})

app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`)
})

