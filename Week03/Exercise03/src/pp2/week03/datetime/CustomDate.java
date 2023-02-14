package pp2.week03.datetime;

public class CustomDate {
    private int d;
    private int m;
    private int y;

    public CustomDate() {

    }

    public CustomDate(int d, int m, int y) {
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
            if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                if (d > 0 && d < 32) {
                    this.d = d;
                    this.m = m;
                    this.y = y;
                }
            }
            else if (m == 2) {
                if (d > 0 && d < 30) {
                    this.d = d;
                    this.m = m;
                    this.y = y;
                }
            }
            else if (m > 0 && m < 12) {
                if (d > 0 && d < 31) {
                    this.d = d;
                    this.m = m;
                    this.y = y;
                }
            }
        }
        else {
            if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                if (d > 0 && d < 32) {
                    this.d = d;
                    this.m = m;
                    this.y = y;
            }
        }
            else if (m == 2) {
                if (d > 0 && d < 29) {
                    this.d = d;
                    this.m = m;
                    this.y = y;
            }
        }
            else if (m > 0 && m < 12) {
            if (d > 0 && d < 31) {
                this.d = d;
                this.m = m;
                this.y = y;
            }
        }
    }
    }

    public int getDay() {
        return this.d;
    }
    public void setDay(int d) {
        this.d = d;
    }

    public int getMonth() {
        return this.m;
    }
    public void setMonth(int m) {
        this.m = m;
    }
    
    public int getYear() {
        return this.y;
    }
    public void setYear(int y) {
        this.y = y;
    }

    public String displayDate() {
        return (this.d + "/" + this.m + "/" + this.y);
    }

    public int difference(CustomDate date) {
        int cnt = 0;
        for (int y = this.y; y <= date.y; y++) {
            if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
                if (m == this.m) {
                    for (int m = this.m; m <= 12; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 29; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
                if (m == date.m) {
                    for (int m = 1; m <= date.m; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 29; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
                if (date.m == this.m) {
                    for (int m = this.m; m <= date.m; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 29; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
            }
            else {
                if (m == this.m) {
                    for (int m = this.m; m <= 12; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 28; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
                if (m == date.m) {
                    for (int m = 1; m <= date.m; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 28; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
                if (date.m == this.m) {
                    for (int m = this.m; m <= date.m; m++) {
                        if (m == this.m) {
                            for (int d = this.d; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == date.m) {
                            for (int d = 1; d <= date.d; d++)
                                cnt++;
                        }
                        else if (this.m == date.m) {
                            for (int d = this.d; d <= date.d; d++)
                                cnt++;
                        }
                        else if (m == 12 || m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                            for (int d = 0; d <= 31; d++)
                                cnt++;
                        }
                        else if (m == 2) {
                            for (int d = 0; d <= 28; d++)
                                cnt++;
                        }
                        else {
                            for (int d = 0; d <= 30; d++)
                                cnt++;
                        }
                    }
                }
            }
        }
        
        return cnt;
    }
}
