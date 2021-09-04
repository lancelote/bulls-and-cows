package stage5.hw8;

class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        if (size > otherArticle.getSize()) {
            return 1;
        } else if (size < otherArticle.getSize()) {
            return -1;
        } else {
            return getTitle().compareTo(otherArticle.getTitle());
        }
    }
}
