"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Greeter = /** @class */ (function () {
    function Greeter(greetMessage) {
        this.greeting = greetMessage;
    }
    Greeter.prototype.greet = function () {
        return "Hello there, " + this.greeting;
    };
    return Greeter;
}());
var greeter = new Greeter("hatter Jack");
console.log(greeter.greet());
var RudeGreeter = /** @class */ (function (_super) {
    __extends(RudeGreeter, _super);
    function RudeGreeter(message) {
        return _super.call(this, message) || this;
    }
    RudeGreeter.prototype.greet = function () {
        return "Shut up, " + this.greeting + "!";
    };
    return RudeGreeter;
}(Greeter));
var rude = new RudeGreeter("Johnny");
console.log(rude.greet());
