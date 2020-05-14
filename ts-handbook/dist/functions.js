"use strict";
var addFunc = function (first, second) {
    return first + second;
};
function withOptional(arg, optArg) {
    if (optArg) {
        return true;
    }
    else {
        return arg > 0;
    }
}
withOptional(4, "heh");
withOptional(4);
function withDefault(arg, defArg) {
    if (defArg === void 0) { defArg = "mda"; }
    return defArg + arg.toString();
}
console.log(withDefault(4, "heh"));
console.log(withDefault(4));
console.log(withDefault(4));
//console.log(withDefault(1, null));
//Duplicate
//function withDefault(arg: number, optArg?: string): string {
//    return arg.toString();
//}
function withVarArgs(arg) {
    var varArgs = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        varArgs[_i - 1] = arguments[_i];
    }
    return arg.toString() + varArgs.join(", ");
}
console.log(withVarArgs(5, "one", "two", "second"));
console.log(withVarArgs(5));
