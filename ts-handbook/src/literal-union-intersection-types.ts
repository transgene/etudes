type KindOfEnum = "value-1" | "value-2" | "value-3";

function suggestBy(kind: KindOfEnum): string {
    if (kind === "value-1") {
        return "lovely";
    } else if (kind === "value-2") {
        return "errrmm...";
    } else if (kind === "value-3") {
        return "you are just plain crazy";
    } else {
        return "you are not crazy, you're jsut dumb";
    }
}
console.log(suggestBy("value-2"));
//console.log(suggestBy("val-2"));

function rollDie(): 1 | 2 | 3 | 4 | 5 | 6 {
    return (Math.floor(Math.random() * 5) + 1) as 1 | 2 | 3 | 4 | 5 | 6;
}
console.log(rollDie());

interface Bird {
    fly(): void;
    layEggs(): void;
}

interface Fish {
    swim(): void;
    layEggs(): void;
}

//declare function getStrangePet(): Fish | Bird;
//let pet = getStrangePet();
//pet.layEggs();

interface ErrorHandling {
    success: boolean;
    error?: { message: string };
}

interface ArtworksData {
    artworks: { title: string }[];
}

interface ArtistsData {
    artists: { name: string }[];
}

type ArtworksResponse = ArtworksData & ErrorHandling;
type ArtistsResponse = ArtistsData & ErrorHandling;

const handleArtistsResponse = (response: ArtistsResponse) => {
    if (response.error) {
        console.error(response.error.message);
        return;
    }
    console.log(response.artists);
};

