/*
 *  Copyright (C) 2010-2013 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.jpexs.asdec.action.swf6;

import com.jpexs.asdec.action.Action;
import com.jpexs.asdec.action.treemodel.ConstantPool;
import com.jpexs.asdec.action.treemodel.EnumerateTreeItem;
import com.jpexs.asdec.action.treemodel.TreeItem;
import java.util.List;
import java.util.Stack;

public class ActionEnumerate2 extends Action {

   public ActionEnumerate2() {
      super(0x55, 0);
   }

   @Override
   public String toString() {
      return "Enumerate2";
   }

   @Override
   public void translate(Stack<TreeItem> stack, ConstantPool constants, List<TreeItem> output, java.util.HashMap<Integer, String> regNames) {
      TreeItem object = stack.pop();
      stack.push(new EnumerateTreeItem(this, object));
   }
}
