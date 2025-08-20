public class UnpackAction extends Action{
    public UnpackAction(Item _item){
        super(_item);
    }

    @Override
    public String execute(Camper _camper, Campsite _campsite) {

        if(_camper.remove(super.getItem())) {
            _campsite.add(super.getItem());
            return _camper + " unpacked " + super.getItem().getSimpleName() + " to the camp site";
        }

        return _camper + " unpacked " + super.getItem().getSimpleName() + " to the camp site because the item is not in the backpack";
    }

    @Override
    public String menuDescription(Camper _camper) {
        return _camper + " will unpack " + super.getItem().getSimpleName() + " to the campsite";
    }
}
