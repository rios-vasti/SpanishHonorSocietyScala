package Main

class MemberPoints()
{
    private var culture = 0.0
    private var communityService = 0.0
    private var fundraising = 0.0 
    private var miscellaneous = 0.0 
    private var deduct = 0.0

    private var total = 0.0

    def getCulture: Double = culture 
    def getCommunityService: Double = communityService
    def getFundraising: Double = fundraising
    def getMiscellaneous: Double = miscellaneous
    def getDeduct: Double = deduct
    def getTotal: Double = culture + communityService + fundraising + miscellaneous - deduct


    def increaseCulture(num: Double):Unit = culture += num 
    def increaseCommunityService(num: Double):Unit = communityService += num 
    def increaseFundraising(num: Double):Unit = fundraising += num 
    def increaseMiscellaneous(num: Double):Unit = miscellaneous += num 
    def increaseDeduct(num: Double):Unit = deduct += num 


    def decreaseCulture(num: Double):Unit = culture -= num 
    def decreaseCommunityService(num: Double):Unit = communityService -= num 
    def decreaseFundraising(num: Double):Unit = fundraising -= num 
    def decreaseMiscellaneous(num: Double):Unit = miscellaneous -= num 
    def decreaseDeduct(num: Double):Unit = deduct -= num 
    



}