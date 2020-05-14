import readline from "readline";

import { MyEvent } from "./basic-types";

function doSomethingWithIFace(ifaceObj: { field: string }) {
    console.log(ifaceObj.field);
}

let obj = { secondField: 10, field: "just cool" };
doSomethingWithIFace(obj);

interface IfaceWithAField {
    field: string;
}

function doSomethingWithExplicitIFace(obj: IfaceWithAField) {
    console.log(obj.field);
}

let obj2 = { secondField: 10, field: "just cool" };
doSomethingWithExplicitIFace(obj2);

interface ObjectConfig {
    name: string;
    kind?: string;
    linkedEvent?: MyEvent;
}

function createObjectBy(
    config: ObjectConfig
): { name: string; kind: string; linkedEvent: MyEvent } {
    let obj = { name: config.name, kind: "newbie", linkedEvent: MyEvent.WTF };
    if (config.kind) {
        obj.kind = config.kind;
    }
    if (config.linkedEvent) {
        obj.linkedEvent = config.linkedEvent;
    }
    return obj;
}
let newObj = createObjectBy({ name: "Joe", kind: "freman" });
console.log(newObj);

interface Immutable {
    readonly name: string;
    readonly ordinal: number;
}
let im1: Immutable = { name: "wat", ordinal: -2 };
//im1.ordinal = 0;

let arr: ReadonlyArray<string> = ["chirik", "second", "fourth"];
//arr[0] = "first";

interface Animal {
    name: string;
}

interface Doggo extends Animal {
    isWoofer: boolean;
}

interface Abomination {
    [wut: number]: Animal;
}

let abomirray: Abomination = [
    { name: "piesel" },
    { isWoofer: false, name: "doggie" } as Doggo,
];
