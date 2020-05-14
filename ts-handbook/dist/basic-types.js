"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var isDone = false;
var num = 3;
var str = "ding";
var templStr = "This string contains number: " + num + "\n\n    And also a boolean: " + isDone + "\n";
console.log(templStr);
var list = [1, 2, 0];
//let illegalList: number[] = [1, 2, 'str'];
var genericList = list;
var tuple;
tuple = [str, num];
console.log(tuple);
console.log(tuple[0].slice(1, 3));
//console.log(tuple[1].slice(1, 3));
// It appears I can't use "reserved" names for enums
var MyEvent;
(function (MyEvent) {
    MyEvent[MyEvent["Death"] = 0] = "Death";
    MyEvent[MyEvent["Birth"] = 1] = "Birth";
    MyEvent[MyEvent["WTF"] = 2] = "WTF";
})(MyEvent = exports.MyEvent || (exports.MyEvent = {}));
var eventEx = MyEvent.WTF;
console.log(eventEx);
console.log(eventEx.toFixed());
var eventName = MyEvent[0];
console.log(eventName);
eventName = MyEvent[-1];
console.log(eventName);
var NumberedEnum;
(function (NumberedEnum) {
    NumberedEnum[NumberedEnum["One"] = 1] = "One";
    NumberedEnum[NumberedEnum["Two"] = 2] = "Two";
    NumberedEnum[NumberedEnum["Three"] = 4] = "Three";
})(NumberedEnum || (NumberedEnum = {}));
var anyVar = 4 + "4";
console.log(anyVar);
var anyVarLen = anyVar.toString();
console.log(anyVarLen);
