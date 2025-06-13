package quick;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        quickTest2();
    }


    static class Player {
        private Short status;

        @java.lang.SuppressWarnings("all")
        public Player() {
        }

        @java.lang.SuppressWarnings("all")
        public Short getStatus() {
            return this.status;
        }

        @java.lang.SuppressWarnings("all")
        public void setStatus(final Short status) {
            this.status = status;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof OptionalTest.Player)) return false;
            final OptionalTest.Player other = (OptionalTest.Player) o;
            if (!other.canEqual((java.lang.Object) this)) return false;
            final java.lang.Object this$status = this.getStatus();
            final java.lang.Object other$status = other.getStatus();
            if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
            return true;
        }

        @java.lang.SuppressWarnings("all")
        protected boolean canEqual(final java.lang.Object other) {
            return other instanceof OptionalTest.Player;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $status = this.getStatus();
            result = result * PRIME + ($status == null ? 43 : $status.hashCode());
            return result;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "OptionalTest.Player(status=" + this.getStatus() + ")";
        }
    }


    static class House {
        Optional<Room> room;

        public Optional<Room> getRoom() {
            return room;
        }

        @java.lang.SuppressWarnings("all")
        public House(final Optional<Room> room) {
            this.room = room;
        }
    }


    static class Room {
        Optional<Table> table;

        public Optional<Table> getTable() {
            return table;
        }

        @java.lang.SuppressWarnings("all")
        public Room(final Optional<Table> table) {
            this.table = table;
        }
    }


    static class Table {
        String colour;

        public String getColour() {
            return colour;
        }

        @java.lang.SuppressWarnings("all")
        public Table(final String colour) {
            this.colour = colour;
        }
    }

    private static void quickTest2() {
        //Player player = null;
        Player player = new Player();
        player.setStatus(new Short("6"));
        Short statusCode = Optional.ofNullable(player).map(Player::getStatus).orElse(new Short("3"));
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
        String tableColour = Optional.ofNullable(houseNULL).flatMap(House::getRoom).flatMap(Room::getTable).map(Table::getColour).orElse("black");
        System.out.println(tableColour);
    }
}
