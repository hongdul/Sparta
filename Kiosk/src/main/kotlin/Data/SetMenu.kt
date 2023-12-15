package Data

class SetMenu {
    val menuList = mutableListOf<Menu>()                    // 데이터 처리 함수에 사용할 메뉴리스트 선언
    fun addMenu(menu: Menu) {
        menuList.add(menu)
    }
    fun getMenu() : Set<String> {                           // 메인화면의 메뉴 카테고리를 Set으로 가져오는 함수
        val set = mutableSetOf<String>()
        menuList.forEach() {
            set += it.component1()
        }
        return set
    }
    fun getSpecial() : List<Menu> {                                // menuList에서 카테고리가 "스페셜 피자"인 항목들을 리스트로 반환
        return menuList.filter{it.component1() == "스페셜 피자"}
    }
    fun getPremium() : List<Menu> {                                // menuList에서 카테고리가 "프리미엄 피자"인 항목들을 리스트로 반환
        return menuList.filter{it.component1() == "프리미엄 피자"}
    }
    fun getOriginal() : List<Menu> {                               // menuList에서 카테고리가 "오리지널 피자"인 항목들을 리스트로 반환
        return menuList.filter{it.component1() == "오리지널 피자"}
    }
    fun getSides() : List<Menu> {                                  // menuList에서 카테고리가 "사이드"인 항목들을 리스트로 반환
        return menuList.filter{it.component1() == "사이드"}
    }
    fun getBeverage() : List<Menu> {                               // menuList에서 카테고리가 "음료"인 항목들을 리스트로 반환
        return menuList.filter{it.component1() == "음료"}
    }
}