package Data

class SetMenu {
    val menuList = mutableListOf<Menu>()
    fun addMenu(menu: Menu) {
        menuList.add(menu)
    }
    fun getMenu() : Set<String> {
        val set = mutableSetOf<String>()
        menuList.forEach() {
            set += it.component1()
        }
        return set
    }
    fun getSpecial() : List<Menu> {
        return menuList.filter{it.component1() == "스페셜 피자"}
    }
    fun getPremium() : List<Menu> {
        return menuList.filter{it.component1() == "프리미엄 피자"}
    }
    fun getOriginal() : List<Menu> {
        return menuList.filter{it.component1() == "오리지널 피자"}
    }
    fun getSides() : List<Menu> {
        return menuList.filter{it.component1() == "사이드"}
    }
    fun getBeverage() : List<Menu> {
        return menuList.filter{it.component1() == "음료"}
    }
}