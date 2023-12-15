import Data.Menu

class Cart {                                                   // 장바구니 객체
    val orderList : MutableList<Menu> = mutableListOf()        // 장바구니 클래스의 프로퍼티로 장바구니 리스트 선언
    fun addCart(menu: Menu) {                                  // 선택한 메뉴를 장바구니의 orderList에 추가하는 함수.
        orderList.add(menu)
        println("장바구니에 ${menu.component2()}이(가) 추가되었습니다.")
    }

    fun getSum() : Int {                        // 장바구니 항목들의 금액을 총합해서 sum으로 반환
        var sum = 0
        for (i in 0..<orderList.size){
            sum += orderList[i].component4()
        }
        return sum
    }
    override fun toString(): String {                   // toString을 override해서
        var orderlist = "[ 장바구니 ]\n"                  // println(cart)로 출력하면 장바구니 설명 나오게 설정
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