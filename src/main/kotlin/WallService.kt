object WallService {
    var idCounter = 1
    private var posts = emptyArray<Post>()
    private var id = 0
    
    fun add(post: Post): Post {
        posts += post

        id = idCounter
        idCounter = idCounter + 1
        return posts.last()
    }

    fun update(id: Int): Boolean {
        for ((index, posts) in posts.withIndex()) {
            if (posts.id == id) {
                posts.text = "изменено"

                return true
            }
        }

        return false
    }


}