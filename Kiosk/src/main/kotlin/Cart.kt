import Data.Menu

class Cart {
    val orderList : MutableList<Menu> = mutableListOf()
    fun addCart(menu: Menu) {
        orderList.add(menu)
        println("장바구니에 ${menu.component2()}이(가) 추가되었습니다.")
    }

    fun getSum() : Int {
        var sum = 0
        for (i in 0..<orderList.size){
            sum += orderList[i].component4()
        }
        return sum
    }
    override fun toString(): String {
        var orderlist = "[ 장바구니 ]\n"
        when(orderList.size) {
            0 -> return "- 장바구니가 비어있습니다 -"
            else -> {
                for (i in 1..orderList.size) {
                    orderlist += "$i. ${orderList[i - 1].component2()}\n가격 : ${orderList[i - 1].component4()} 원\n"
                }
                return orderlist
            }
        }
    }
}