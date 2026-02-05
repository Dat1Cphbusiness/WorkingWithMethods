    String title = "Game";
    double version = 2;

    void printInfo() {
        //System.out.println("Title: " + title+" v."+version);
        System.out.printf("Title: %s v.%.1f", title, version);
        System.out.println();

    }

    void incrementVersion() {
        //version++;
        version+=.1;
    }


    void main() {
        printInfo();
        incrementVersion();
        printInfo();
        incrementVersion();
        printInfo();
        incrementVersion();
        printInfo();
    }

