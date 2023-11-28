//object WallService {
//    var idCounter = 1
//    private var posts = emptyArray<Post>()
//    private var id = 0
//
//    fun add(post: Post): Post {
//        posts += post.copy(id= idCounter++)
//
//
//
//        return posts.last()
//    }
//
//    fun update(post: Post): Boolean {
//        for ((index, postInArray) in posts.withIndex()) {
//            if (postInArray.id == id) {
//                posts[index] = post.copy()
//                return true
//            }
//        }
//
//        return false
//    }
//
//
//}