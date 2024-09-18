public class Player {

        private Integer position;

        public String getName() {
            return name;
        }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
            this.name = name;
        }

        private String name;

        public Integer getPrvPosition() {
            return prvPosition;
        }

        public void setPrvPosition(Integer prvPosition) {
            this.prvPosition = prvPosition;
        }

        private Integer prvPosition;

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

}
