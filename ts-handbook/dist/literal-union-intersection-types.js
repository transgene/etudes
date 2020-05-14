"use strict";
function suggestBy(kind) {
    if (kind === "value-1") {
        return "lovely";
    }
    else if (kind === "value-2") {
        return "errrmm...";
    }
    else if (kind === "value-3") {
        return "you are just plain crazy";
    }
    else {
        return "you are not crazy, you're jsut dumb";
    }
}
console.log(suggestBy("value-2"));
//console.log(suggestBy("val-2"));
function rollDie() {
    return (Math.floor(Math.random() * 5) + 1);
}
console.log(rollDie());
var handleArtistsResponse = function (response) {
    if (response.error) {
        console.error(response.error.message);
        return;
    }
    console.log(response.artists);
};
