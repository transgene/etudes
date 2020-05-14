"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var basic_types_1 = require("./basic-types");
function doSomethingWithIFace(ifaceObj) {
    console.log(ifaceObj.field);
}
var obj = { secondField: 10, field: "just cool" };
doSomethingWithIFace(obj);
function doSomethingWithExplicitIFace(obj) {
    console.log(obj.field);
}
var obj2 = { secondField: 10, field: "just cool" };
doSomethingWithExplicitIFace(obj2);
function createObjectBy(config) {
    var obj = { name: config.name, kind: "newbie", linkedEvent: basic_types_1.MyEvent.WTF };
    if (config.kind) {
        obj.kind = config.kind;
    }
    if (config.linkedEvent) {
        obj.linkedEvent = config.linkedEvent;
    }
    return obj;
}
var newObj = createObjectBy({ name: "Joe", kind: "freman" });
console.log(newObj);
var im1 = { name: "wat", ordinal: -2 };
//im1.ordinal = 0;
var arr = ["chirik", "second", "fourth"];
var abomirray = [
    { name: "piesel" },
    { isWoofer: false, name: "doggie" },
];
