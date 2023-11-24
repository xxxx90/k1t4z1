import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add(post: Post) {
var post1 = Post(comments = Comments(), copyright = " ", likes = Likes(), repost = Reposts())
        add( post1)
val result = (post.id >0)


        assertEquals (true,result  )
    }

    @Test
    fun update(i: Int) {
      val  result = update(1)
        assertEquals(false, result)

    }
}