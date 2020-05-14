let isDone: boolean = false;
let num: number = 3;
let str: string = "ding";
let templStr: string = `This string contains number: ${num}

    And also a boolean: ${isDone}
`;
console.log(templStr);

let list: number[] = [1, 2, 0];
//let illegalList: number[] = [1, 2, 'str'];
let genericList: Array<number> = list;

let tuple: [string, number];
tuple = [str, num];
console.log(tuple);
console.log(tuple[0].slice(1, 3));
//console.log(tuple[1].slice(1, 3));

// It appears I can't use "reserved" names for enums
export enum MyEvent {
    Death,
    Birth,
    WTF,
}

let eventEx: MyEvent = MyEvent.WTF;
console.log(eventEx);
console.log(eventEx.toFixed());
let eventName: string = MyEvent[0];
console.log(eventName);
eventName = MyEvent[-1];
console.log(eventName);

enum NumberedEnum {
    One = 1,
    Two = 2,
    Three = 4,
}

let anyVar: any = 4 + "4";
console.log(anyVar);
let anyVarLen: string = (anyVar as number).toString();
console.log(anyVarLen);
