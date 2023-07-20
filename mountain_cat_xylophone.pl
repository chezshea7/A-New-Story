#!/usr/bin/perl

# This perl script is a creative writing tool
# that creates a new story based on user inputs

use warnings;
use strict;

print "\nLet's start a new story: \n\n";

# Get the title of the story
print "Please enter a title for the story: ";
my $title = <>;
chomp $title;

# Get the name of the protagonist
print "Please enter the name of the protagonist: ";
my $protagonist = <>;
chomp $protagonist;

# Get the setting
print "Please enter the setting of the story: ";
my $setting = <>;
chomp $setting;

# Get the antagonist
print "Please enter the name of the antagonist: ";
my $antagonist = <>;
chomp $antagonist;

# Get the climax
print "Please enter the climax of the story: ";
my $climax = <>;
chomp $climax;

# Build the story
my $story = "$title \n\nIt was a typical day in $setting when $protagonist decided to go on an adventure. Little did $protagonist know that $antagonist was lurking about and had sinister plans. $protagonist soon found $antagonist at the climax of the story which was $climax. How will $protagonist get out of this situation? \n\nThe End";

# Output the story
print $story;