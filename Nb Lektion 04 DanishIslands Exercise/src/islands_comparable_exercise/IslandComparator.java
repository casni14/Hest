/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package islands_comparable_exercise;

import java.util.Comparator;
/**
 *
 * @author Emil
 */
public class IslandComparator implements Comparator<DanishIsland> {
        public int compare(DanishIsland a, DanishIsland b) {
        if(a.getAddresses() == b.getAddresses()) {
        return (a.getName().compareTo(b.getName()));
        }
        else if(a.getAddresses() > b.getAddresses()) {
            return 1;
        }
        else{
            return -1;
                    }
        }
        
    }
    
