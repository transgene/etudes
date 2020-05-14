let addFunc: (first: number, second: number) => number = function (
    first: number,
    second: number
): number {
    return first + second;
};

function withOptional(arg: number, optArg?: string): boolean {
    if (optArg) {
        return true;
    } else {
        return arg > 0;
    }
}
withOptional(4, "heh");
withOptional(4);

function withDefault(arg: number, defArg: string = "mda"): string {
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

function withVarArgs(arg: number, ...varArgs: string[]) {
    return arg.toString() + varArgs.join(", ");
}
console.log(withVarArgs(5, "one", "two", "second"));
console.log(withVarArgs(5));

