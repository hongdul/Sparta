import Data.Menu
import Data.MenuData

class Prompt {
    fun mainmenu(setmenu: MenuData, cart : Cart) : String {   // 메인 화면
        val menuSet = setmenu.menu.getMenu()
        println("주문하실 메뉴를 선택해주세요")
        for (i in 1..menuSet.size) {
            println("$i. ${menuSet.elementAt(i - 1)}")
        }
        println("p: 계산   r: 주문 수정하기   q: 종료   아무 키 입력: 메인 화면")
        println(cart)
        val choice : String = readln()
        return choice
    }
    fun promptMenu(list : List<Menu>, cart : Cart) : String {              // 메뉴 종류 리스트와 장바구니 객체를
        println("주문하실 메뉴를 선택해주세요")                                                 // 인자로 받음
        for (i in 1..list.size) {                                                  // for 루프로
            println("$i. ${list[i-1].component2()} : ${list[i-1].component4()}원")        // 메뉴 이름 : 가격
            println("                        - ${list[i-1].component3()}")        // 메뉴 설명 출력
        }
        println("p: 계산   r: 주문 수정하기   q: 종료   아무 키 입력: 메인 화면")
        println(cart)
        val choice : String = readln()
        when (choice) {
            "p" -> return "p"
            "q" -> return "q"
            "r" -> return "r"
            "" -> return "mainmenu"
        }
        if (choice.toInt() in IntRange(1, list.size)) {
            cart.addCart(list[choice.toInt() - 1])
        }
        return "mainmenu"
    }
    fun removeItem(cart: Cart) : String {
        println(cart)
        println("삭제할 항목의 번호를 입력해주세요")
        println("p: 계산  q: 종료   아무 키 입력: 메인 화면")
        val removeInput: String = readln()
        when (removeInput) {
            "p" -> return "p"
            "q" -> return "q"
            "" -> return "mainmenu"
        }
        if (removeInput.toInt() in IntRange(1, cart.orderList.size)) {
            println("${cart.orderList.elementAt(removeInput.toInt() - 1).component2()}(이)가 삭제되었습니다.\n")
            cart.orderList.removeAt(removeInput.toInt() - 1)
        }
        return "mainmenu"
    }

    fun order(cart: Cart) : String {   // 계산 화면 출력, 주문서 리스트 받아서 출력
        if (cart.getSum() == 0) {
            println("선택된 항목이 없습니다\n"); return "mainmenu"
        }
        println(cart)
        println("[ 주문 금액 ]")
        println("${cart.getSum()} 원")
        println("위와 같이 주문 하시겠습니까?")
        println("1. 계산하기        2. 주문 추가하기        3. 종료하기")
        val orderInput: String = readln()
        if (orderInput == "") order(cart)
        when (orderInput) {
            "1" -> {println("${cart.getSum()} 원을 결제해주세요."); throw Exception("주문이 완료되었습니다.")}
            "2" -> return "mainmenu"
            "3" -> {
                throw Exception("주문을 종료합니다")
            }
            else -> order(cart)
        }
    }
}