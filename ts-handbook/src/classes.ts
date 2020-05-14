class Greeter {
    protected greeting: string;

    constructor(greetMessage: string) {
        this.greeting = greetMessage;
    }

    greet() {
        return "Hello there, " + this.greeting;
    }
}

let greeter = new Greeter("hatter Jack");
console.log(greeter.greet());

class RudeGreeter extends Greeter {
    constructor(message: string) {
        super(message);
    }

    greet() {
        return "Shut up, " + this.greeting + "!";
    }
}
let rude = new RudeGreeter("Johnny");
console.log(rude.greet());

class ReadOnlier {
    readonly field: string;
    constructor(val: string) {
        this.field = val;
    }
}

class Employee {
    private _fullName: string;

    get fullName(): string {
        return this._fullName;
    }

    set fullName(newName: string) {
        if (!newName || newName.length < 5) {
            throw new Error("nope");
        }
        this._fullName = newName;
    }
}
