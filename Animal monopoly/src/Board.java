
public class Board {
    private Tile[] tiles;
    private Player[] players;


    public Board(Animal[] a, Player[] playersArray) {
        this.tiles = new Tile[26];
        for(int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile("0".repeat(2-String.valueOf(i).length()) + String.valueOf(i) + "   ", a[i]);
        }
        players = new Player[playersArray.length];
        for(int i = 0; i < playersArray.length; i++){
            //players = new Player[playersArray.length];
            players[i] = playersArray[i];
            System.out.println(players[i].getName());
        }
        tiles[0] = new Tile("start", null);
        tiles[13] = new Tile("skip ", null);
    }

    public Tile getTile(int i){
        return tiles[i];
    }
    public String tilePlayers(int tile) {
        //Player[] players = {new Player(0, "@")}; // also assuming this will be a thing we have globally set elsewhere, example values

        String out = "";
        for(int i = 0; i < players.length; i++) {
            if(players[i].getPosition() == tile) {
                out += players[i].getSymbol();
            }
        }
        return out + " ".repeat(5 - out.length());
    }

    public String tileDisplay(int tile) { // so this one is actually not static bc the tiles are per board if there were multiple boards
        return tile < this.tiles.length ? this.tiles[tile].getDisplay() : "-    ";
    } // default to - display because i dont have all the tiles

    public String tileAnimals(int start, int end) { // and this too
        String out = "";
        for(int i = start; i < end; i++) {
            if (this.tiles[i].getAnimal() == null) {
                out += "      | ";
            } else {
                out += i < this.tiles.length ? this.tiles[i].getAnimal().getAnimalEmoji() + "    | " : "      | ";
            }
        }
        return out;
    }

    public void displayBoard() { // this all seems very silly and there must be a better way of structuring my code here..
        String output = "-".repeat(65) + "\n| "; // top of board
        for(int i = 0; i < 8; i++) { // top row of players
            output += tilePlayers(i) + " | ";
        }
        output += "\n| ";
        for(int i = 0; i < 8; i++) { // top row of tile displays
            output += tileDisplay(i) + " | ";
        }
        output += "\n| ";
        output += tileAnimals(0, 8);
        output += "\n" + "-".repeat(65) + "\n| "; // separating row

        for(int i = 0; i < 5; i++) { // squares 8-12 and 21-25
            output += tilePlayers(25-i) + " | " + " ".repeat(46) + "| " + tilePlayers(8+i) + " |\n| ";
            output += tileDisplay(25-i) + " | " + " ".repeat(46) + "| " + tileDisplay(8+i) + " |\n| ";
            output += tileAnimals(25-i, 25-i) + " | " + " ".repeat(46) + "| " + tileAnimals(8+i, 8+i) + " |\n";
            if(i != 4) { // don't put the separating bits at the bottom
                output += "-".repeat(9) + " ".repeat(47) + "-".repeat(9) + "\n| ";
            }
        }
        output += "-".repeat(65) + "\n| "; // separating row

        for(int i = 0; i < 8; i++) { // bottom row of players
            output += tilePlayers(20-i) + " | ";
        }
        output += "\n| ";
        for(int i = 0; i < 8; i++) { // bottom row of tile displays
            output += tileDisplay(20-i) + " | ";
        }
        output += "\n| ";
        for(int i = 0; i < 8; i++) { // bottom row of animals
            output += tileAnimals(20-i, 20-i) + " | ";
        }
        output += "\n" + "-".repeat(65) + "\n\n"; // last row

        System.out.println(output);
    }
}
