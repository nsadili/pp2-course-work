package Week03.pp2.datetime;

public class CustomDate {
        private int month;
        private int day;
        private int year;

        public CustomDate(int month, int day, int year) {
            if (month > 0 && month <= 12) {
                this.month = month;
            } else {
                this.month = 1;
            }
            if (day > 0 && day <= 31) {
                this.day = day;
            } else {
                this.day = 1;
            }
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            if (month > 0 && month <= 12) {
                this.month = month;
            } else {
                this.month = 1;
            }
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            if (day > 0 && day <= 31) {
                this.day = day;
            } else {
                this.day = 1;
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void displayDate() {
            System.out.println(month + "/" + day + "/" + year);
        }
    }