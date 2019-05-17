package com.goldmines.xmlparsing

object XMLFile {

  //var sampleXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SimpleQuestion xmlns:d3p1=\"http://www.w3.org/2001/XMLSchema-instance\"><qid>4849</qid><MediaX><MediaItem><location>452,160,128,128</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>4849Media1.jpg</filename><wasRendered>true</wasRendered></MediaItem><MediaItem><location>60,40,535,93</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Rtf</signature><font>Arial</font><content>Gary and Sam went running. Sam ran 2 miles less than Gary. Let &lt;B&gt;&lt;I&gt;x &lt;/B&gt;&lt;/I&gt;represent Gary's miles.&lt;BR&gt;&lt;P&gt;Which expression represents the number of miles Sam ran?</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid></MediaItem></MediaX><Answers><AnswerItem><location>160,160,97,27</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>true</correct><signature>AnswerR</signature><font>Arial</font><content>&lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; - 2</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid><explain><qid></qid><MediaX><MediaItem><location>204,128,343,115</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Rtf</signature><font>Arial</font><content>Sam ran 2 miles less than Gary.&lt;BR&gt;&lt;P&gt;Gary's miles are represented by &lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt;.&lt;BR&gt;&lt;P&gt;The number of miles Sam ran are &lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; -2.</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,227,97,27</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>AnswerR</signature><font>Arial</font><content>&lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; &lt;B&gt;&amp;divide;&lt;/B&gt; 2</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid><explain><qid></qid><MediaX><MediaItem><location>116,134,582,115</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Rtf</signature><font>Arial</font><content>If Sam ran half the miles Gary ran, &lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; &lt;B&gt;&amp;divide;&lt;/B&gt; 2 would represent his miles.&lt;BR&gt;&lt;P&gt;Sam ran 2 miles less than Gary.&lt;BR&gt;&lt;P&gt;Find the equation that shows less.</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,294,97,27</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>AnswerR</signature><font>Arial</font><content>&lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; + 2</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid><explain><qid></qid><MediaX><MediaItem><location>110,132,582,115</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Rtf</signature><font>Arial</font><content>If Sam ran 2 more miles than Gary, &lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; + 2 would represent his miles.&lt;BR&gt;&lt;P&gt;Sam ran 2 miles less than Gary.&lt;BR&gt;&lt;P&gt;Find the equation that shows less.</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,361,97,27</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>AnswerR</signature><font>Arial</font><content>&lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; x 2</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid><explain><qid></qid><MediaX><MediaItem><location>105,134,615,115</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Rtf</signature><font>Arial</font><content>If Sam ran 2 times the miles Gary ran, &lt;B&gt;&lt;I&gt;x&lt;/B&gt;&lt;/I&gt; x 2 would represent his miles.&lt;BR&gt;&lt;P&gt;Sam ran 2 miles less than Gary.&lt;BR&gt;&lt;P&gt;Find the equation that shows less.</content><size>14</size><hints>False, False, False, False</hints><wasRendered>false</wasRendered><scrollable>false</scrollable><essayid>0</essayid></MediaItem></MediaX><Answers/></explain></AnswerItem></Answers></SimpleQuestion>"
  // var sampleXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SimpleQuestion xmlns:d3p1=\"http://www.w3.org/2001/XMLSchema-instance\"><qid>128042</qid><MediaX><MediaItem><location>60,43,581,89</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>Street signs were delivered to a town hall. All of the signs have three equal sides and angles.What is the shape of the signs?</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>430,162,114,99</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128042Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers><AnswerItem><location>160,160,162,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>true</correct><signature>Answer</signature><font>Arial</font><content>equilateral triangle</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>201,213,382,89</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>An equilateral triangle has three equal sides and three 60-degree angles.The street signs are equilateral triangles.</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>342,74,100,115</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128042Explain1Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,223,107,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>rectangle</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>207,213,445,67</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>A rectangle has four sides.Find the shape with three equal sides and angles.</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>336,84,128,98</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128042Explain2Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,286,134,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>obtuse triangle</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>155,209,498,67</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>An obtuse triangle has one angle greater than 90 degrees.Find the shape with three equal sides and angles.</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>309,73,172,114</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128042Explain3Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>160,349,112,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>trapezoid</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>202,225,442,67</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>A trapezoid has four sides.Find the shape with three equal sides and angles.</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>334,93,150,109</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128042Explain4Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem></Answers></SimpleQuestion>"
  var sampleXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SimpleQuestion xmlns:d3p1=\"http://www.w3.org/2001/XMLSchema-instance\"><qid>128421</qid><MediaX><MediaItem><location>50,45,661,89</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>At a movie theater, a small popcorn holds 90 pieces of popcorn, and an extra large popcorn holds 900 pieces of popcorn. Which is true about the numbers 90 and 900? </content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>461,171,97,128</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128421Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers><AnswerItem><location>150,170,127,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>true</correct><signature>Answer</signature><font>Arial</font><content>90 x 10 = 900</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>306,127,188,111</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>90 has 9 tens. 900 has 9 hundreds. 90 x 10 = 900</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>150,233,154,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>90 x 100 = 9,000</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>216,181,367,199</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>90 has 9 tens. 900 has 9 hundreds. A digit in the hundreds place is ten times the same digit in the tens place.Find the multiplication sentence that shows how 90 and 900 are related. </content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>275,76,205,78</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128421Explain2Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>150,296,181,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>90 x 1,000 = 90,000</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>225,173,367,199</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>90 has 9 tens. 900 has 9 hundreds. A digit in the hundreds place is ten times the same digit in the tens place.Find the multiplication sentence that shows how 90 and 900 are related. </content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>275,76,205,78</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128421Explain3Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem><AnswerItem><location>150,359,203,23</location><color>0,0,0</color><align>0</align><locked>false</locked><correct>false</correct><signature>Answer</signature><font>Arial</font><content>90 x 10,000 = 900,000</content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered><explain><qid></qid><MediaX><MediaItem><location>224,181,367,199</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Text</signature><font>Arial</font><content>90 has 9 tens. 900 has 9 hundreds. A digit in the hundreds place is ten times the same digit in the tens place.Find the multiplication sentence that shows how 90 and 900 are related. </content><size>14</size><hints>false,false,false,False</hints><wasRendered>false</wasRendered></MediaItem><MediaItem><location>275,76,205,78</location><color>0,0,0</color><align>0</align><locked>false</locked><signature>Picture</signature><filename>128421Explain4Media2.jpg</filename><wasRendered>true</wasRendered></MediaItem></MediaX><Answers/></explain></AnswerItem></Answers></SimpleQuestion>"


}