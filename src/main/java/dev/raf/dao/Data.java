package dev.raf.dao;

import dev.raf.domain.Coordinats;
import dev.raf.domain.FossilEntyty;
import dev.raf.domain.FossilTypes;
import dev.raf.domain.Period;

import java.util.ArrayList;
import java.util.List;

class Data {

    List<FossilEntyty> fossilEntityList = new ArrayList<FossilEntyty>();



    public Data(){
        fossilEntityList.add(new FossilEntyty(1, FossilTypes.BODY, Period.CENOZOIC,"slug1",new Coordinats(150.25,15.45),22,"something descriptiv1",12.50f));
        fossilEntityList.add(new FossilEntyty(2, FossilTypes.PSEUDO, Period.MESSOSOIC,"dog2",new Coordinats(500.25,90.45),8,"something descriptiv2",22.50f));
        fossilEntityList.add(new FossilEntyty(3, FossilTypes.CARBON, Period.PALEOZOIC,"tree3",new Coordinats(1250.25,601.45),150,"something descriptiv3",500.50f));
        fossilEntityList.add(new FossilEntyty(4, FossilTypes.MOLECULAR, Period.PALEOZOIC,"worm4",new Coordinats(450.25,1.45),2,"something descriptiv4",.50f));
        fossilEntityList.add(new FossilEntyty(5, FossilTypes.TRACE, Period.CENOZOIC,"dino5",new Coordinats(6050.25,3005.45),8002,"something descriptiv5",7002.50f));
        fossilEntityList.add(new FossilEntyty(6, FossilTypes.BODY, Period.MESSOSOIC,"t-rex6",new Coordinats(0.25,5.45),222,"something descriptiv6",30012.50f));
        fossilEntityList.add(new FossilEntyty(7, FossilTypes.PSEUDO, Period.MESSOSOIC,"palm7",new Coordinats(900.25,60.45),7005,"something descriptiv7",7125.50f));
        fossilEntityList.add(new FossilEntyty(8, FossilTypes.BODY, Period.CENOZOIC,"rat",new Coordinats(14684.0,145.0),86,"something descriptiv8",45f));
        fossilEntityList.add(new FossilEntyty(9, FossilTypes.MOLECULAR, Period.CENOZOIC,"sluger",new Coordinats(2135744.25,65784.45),56,"something descriptiv9",12f));
        fossilEntityList.add(new FossilEntyty(10, FossilTypes.TRACE, Period.PALEOZOIC,"slugtys",new Coordinats(547524.25,125374.45),63,"something descriptiv10",50f));

    }

    public List<FossilEntyty> getFossilEntityList() {
        return fossilEntityList;
    }
}
