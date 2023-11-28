import org.junit.Test
import org.junit.Assert.*


class WallServiceTest {

    @Test
    fun testAdd() {
        val post1 = Post(comments = Comments(), copyright = " ", likes = Likes(), repost = Reposts(), text = "yes")
        WallService.add(post1)
        val result = (WallService.idCounter)


        assertEquals(2, result)
    }

    @Test

    fun testUpdate() {

        val post1 = Post()
        val post2 = Post()
        val post4 = Post()
        val post5 = Post()
        val post3 = Post(id = 1, text = "88")
        WallService.add(post1)
        WallService.add(post2)
        val result = WallService.update(post3)
        assertTrue(result)

    }
}