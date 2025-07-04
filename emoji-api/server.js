const express = require('express');
const fs = require('fs');
const app = express();
const PORT = 3000;

//Load emoji data
const emojiData = JSON.parse(fs.readFileSync('emojiDictionary.json', 'utf8'));

//Allow CORS if needed
app.use((req, res, next) => {
    res.setHeader('Access-Controll-Allow-Origin', '*');
    next();
});

//Get emoji word
app.get('/emoji', (req, res) => {
    const word = req.query.word?.toLocaleLowerCase();
    const emoji = emojiData[word] || "❌ Not found";
    res.json({word, emoji});
});

app.listen(PORT, () => {
    console.log(`🚀 Emoji API running at http://localhost:${PORT}`)
})