class MemberPoints()
{
    private var culture = 0.0
    private var communityService = 0.0
    private var  fundraising = 0.0 
    private var miscellaneous = 0.0 
    private var deduct = 0.0

    private var total = 0.0

    def getCulture: Double = culture 
    def getCommunityService: Double = communityService
    def getFundraising: Double = fundraising
    def getMiscellaneous: Double = miscellaneous
    def getDeduct: Double = deduct
    def getTotal: Double = culture + communityService + fundraising + miscellaneous - deduct


    def increaseCulture(num: Double):Unit = num + culture
    def increaseCommunityService(num: Double):Unit = num + communityService
    def increaseFundraising(num: Double):Unit = num + fundraising
    def increaseMiscellaneous(num: Double):Unit = num + miscellaneous
    def increaseDeduct(num: Double):Unit = num + deduct

    def decreaseCulture(num: Double):Unit = num - culture
    def decreaseCommunityService(num: Double):Unit = num - communityService
    def decreaseFundraising(num: Double):Unit = num - fundraising
    def decreaseMiscellaneous(num: Double):Unit = num - miscellaneous
    def decreaseDeduct(num: Double):Unit = num - deduct
    



}