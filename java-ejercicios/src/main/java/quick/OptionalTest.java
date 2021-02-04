package quick;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        quickTest2();
    }

    @Data
    static class Player {
        private Short status;
    }

    @AllArgsConstructor
    static class House {
        Optional<Room> room;

        public Optional<Room> getRoom() {
            return room;
        }
    }

    @AllArgsConstructor
    static class Room {
        Optional<Table> table;

        public Optional<Table> getTable() {
            return table;
        }
    }

    @AllArgsConstructor
    static class Table {
        String colour;

        public String getColour() {
            return colour;
        }
    }

    private static void quickTest2() {
        //Player player = null;
        Player player = new Player();
        player.setStatus(new Short("6"));

        Short statusCode = Optional.ofNullable(player)
                .map(Player::getStatus).orElse(new Short("3"));

        System.out.println(statusCode);

    }

    private static void quickTest1() {
        //Table table1 = new Table("black");
//        Table table1 = null;
//        Boolean isBlueTable = Optional.ofNullable(table1)
//                .filter(e -> e.getColour() == "black")
//                .isPresent();
//        System.out.println(isBlueTable);

        Table tableNULL = null;
        Table tableEMPTY = new Table("");
        Table tableOK = new Table("Froylán Aguilar");

        Room roomOK = new Room(Optional.of(tableNULL));
        House houseOK = new House(Optional.of(roomOK));
        House houseNULL = null;

//        String tableColour = Optional.ofNullable(houseNULL)
        String tableColour = Optional.ofNullable(houseNULL)
                .flatMap(House::getRoom)
                .flatMap(Room::getTable)
                .map(Table::getColour)
                .orElse("black");

        System.out.println(tableColour);
    }

}
